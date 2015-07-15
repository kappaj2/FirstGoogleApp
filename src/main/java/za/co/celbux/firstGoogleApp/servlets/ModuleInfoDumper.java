package za.co.celbux.firstGoogleApp.servlets;

import com.google.appengine.api.modules.ModulesService;
import com.google.appengine.api.modules.ModulesServiceFactory;

public class ModuleInfoDumper {

	public void dumpInfo() {

		ModulesService modulesApi = ModulesServiceFactory.getModulesService();

		// Get the module name handling the current request.
		String currentModuleName = modulesApi.getCurrentModule();
		// Get the instanceID handling the current request.
		//String currentInstanceId = modulesApi.getCurrentInstanceId();

		String currentVersion = modulesApi.getCurrentVersion();
		System.out.println("currentModuleName	=>" + currentModuleName);
		//System.out.println("currentInstanceId	=>" + currentInstanceId);
		System.out.println("currentVersion		=>" + currentVersion);
	}
}
