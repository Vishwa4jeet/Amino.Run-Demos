package sapphire.appexamples.hankstodo.device;

import java.net.InetSocketAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import sapphire.appexamples.hankstodo.app.TodoList;
import sapphire.appexamples.hankstodo.app.TodoListManager;
import sapphire.common.SapphireObjectID;
import sapphire.kernel.server.KernelServer;
import sapphire.kernel.server.KernelServerImpl;
import sapphire.oms.OMSServer;

public class TodoActivity {
	public static TodoList tl;

	public static void setObject(String[] args){
		Registry registry;
		try {
			registry = LocateRegistry.getRegistry(args[0], Integer.parseInt(args[1]));
			OMSServer server = (OMSServer) registry.lookup("SapphireOMS");

			KernelServer nodeServer = new KernelServerImpl(new InetSocketAddress(args[2], Integer.parseInt(args[3])), new InetSocketAddress(args[0], Integer.parseInt(args[1])));

			SapphireObjectID sapphireObjId = server.createSapphireObject("sapphire.appexamples.hankstodo.app.TodoListManager");
			TodoListManager tlm = (TodoListManager)server.acquireSapphireObjectStub(sapphireObjId);
			System.out.println("Received tlm: " + tlm);

			tl = tlm.newTodoList("Hanks");
			System.out.println("Received tl1: " + tl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void addTaskItem(String item) {
		String outcome = tl.addToDo(item);
		System.out.println(outcome);
	}

	public static void removeTaskItem(int pos) {
		tl.removeToDo(pos);
	}
}
