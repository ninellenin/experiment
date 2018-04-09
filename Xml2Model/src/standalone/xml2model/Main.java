package standalone.xml2model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("You should pass the resource as program parameter.");
			return;
		}

		Xml2Model xml2model = new Xml2Model();
		Resource resource = xml2model.toModel("simple.xml");
		/*EList<EObject> list = resource.getContents();
		System.out.println(resource.isLoaded());
		EObject obj = list.get(0).eContents().get(0);
		System.out.println(obj.eContents().get(0));*/
		
		System.out.println("Hello!");
	}

}
