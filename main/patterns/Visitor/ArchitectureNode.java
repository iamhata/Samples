package patterns.Visitor;

public class ArchitectureNode extends MapNode {

	public ArchitectureNode(String aName) {
		super(aName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(NodeVisitor v) {
		// TODO Auto-generated method stub
		v.visitArchitecture(this);
	}

}
