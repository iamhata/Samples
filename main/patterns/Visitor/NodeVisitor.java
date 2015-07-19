package patterns.Visitor;

public interface NodeVisitor {
	void visitArchitecture(ArchitectureNode aNode);
	void visitFruniture(FurnitureNode aNode);
}
