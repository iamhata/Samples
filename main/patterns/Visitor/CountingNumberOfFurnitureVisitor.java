package patterns.Visitor;

public class CountingNumberOfFurnitureVisitor implements NodeVisitor {
	private int count = 0;

	@Override
	public void visitArchitecture(ArchitectureNode aNode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitFruniture(FurnitureNode aNode) {
		// TODO Auto-generated method stub
		count++;
	}
	public int getNumberOfVisitedFurnitureNode(){
		return count;
	}

}
