package patterns.Visitor;

public class LocationCheckVisitor implements NodeVisitor {

	@Override
	public void visitArchitecture(ArchitectureNode aNode) {
		// TODO Auto-generated method stub
		System.out.println("Check architecture node'" +aNode.getName()+"' location...");

	}

	@Override
	public void visitFruniture(FurnitureNode aNode) {
		// TODO Auto-generated method stub
		System.out.println("Check furniture node'"+ aNode.getName()+"' location...");
	}

}
