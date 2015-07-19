package patterns.Visitor;

public class FurnitureNode extends MapNode {

	public FurnitureNode(String aName) {
		super(aName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(NodeVisitor v) {
		// TODO Auto-generated method stub
		v.visitFruniture(this);
	}

}
