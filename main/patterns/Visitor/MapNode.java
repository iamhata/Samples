package patterns.Visitor;

public abstract class MapNode {
	private String name = null;
	public MapNode(String aName){
		name = aName;
	}
	public String getName(){
		return name;
	}
	abstract public void accept(NodeVisitor v);

}
