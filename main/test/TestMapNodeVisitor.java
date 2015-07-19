package test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import patterns.Visitor.ArchitectureNode;
import patterns.Visitor.CountingNumberOfFurnitureVisitor;
import patterns.Visitor.FurnitureNode;
import patterns.Visitor.LocationCheckVisitor;
import patterns.Visitor.MapNode;

public class TestMapNodeVisitor {

	@Test
	public void testMapNodeVisitor() {
		List<MapNode> map = new LinkedList<MapNode>();
		
		map.add(new ArchitectureNode("House"));
		map.add(new ArchitectureNode("Bridge"));
		map.add(new ArchitectureNode("Castle"));
		
		map.add(new FurnitureNode("Bed"));
		map.add(new FurnitureNode("Chair"));
		map.add(new FurnitureNode("Table"));
		map.add(new FurnitureNode("Coffe Table"));
	
		LocationCheckVisitor visitor = new LocationCheckVisitor();
		for(MapNode node:map){
			node.accept(visitor);
		}
	}
	@Test
	public void testCountNumberOfFurnitureVisitor(){
		List<MapNode> map = new LinkedList<MapNode>();
		
		map.add(new ArchitectureNode("House"));
		map.add(new ArchitectureNode("Bridge"));
		map.add(new ArchitectureNode("Castle"));
		
		map.add(new FurnitureNode("Bed"));
		map.add(new FurnitureNode("Chair"));
		map.add(new FurnitureNode("Table"));
		map.add(new FurnitureNode("Coffe Table"));
	
		CountingNumberOfFurnitureVisitor visitor = new CountingNumberOfFurnitureVisitor();
		for(MapNode node:map){
			node.accept(visitor);
		}
		assertEquals(4,visitor.getNumberOfVisitedFurnitureNode());
	}

}
