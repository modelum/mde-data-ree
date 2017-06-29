grammar conexp; 

// Autogenerated options
options {
	output=template;
}




// Autogenerated import
@header {
	import gts.modernization.model.CST.impl.*;
	import gts.modernization.model.CST.*;
	import java.util.Iterator;
}

// Rules
mainRule returns [Node returnNode] 
:	 databaseGen+=database  TK_0=';' ( table_and_implicationsGen+=table_and_implications)* 
	{
		// Create return CST Node
		Node mainRuleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		mainRuleReturnNode.setKind("mainRule");
	    // Create a CST Node
		if($databaseGen != null) {
	        for(Iterator it = $databaseGen.iterator(); it.hasNext(); )  { 
	            conexpParser.database_return r = (conexpParser.database_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("database");
	            	mainRuleReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
	    // Create a Token CST Leaf	
	    if($TK_0 != null) {
			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", $TK_0.text, TK_0.getCharPositionInLine(), TK_0.getLine());
	 		mainRuleReturnNode.getChildren().add(TK_0Leaf);
	 	}
	    // Create a CST Node
		if($table_and_implicationsGen != null) {
	        for(Iterator it = $table_and_implicationsGen.iterator(); it.hasNext(); )  { 
	            conexpParser.table_and_implications_return r = (conexpParser.table_and_implications_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("table_and_implications");
	            	mainRuleReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
		// Returns the Node with CST Leaves/Nodes
		$mainRule.returnNode = mainRuleReturnNode;
	}
	;

database returns [Node returnNode] 
:	 IDGen=ID 
	{
		// Create return CST Node
		Node databaseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		databaseReturnNode.setKind("database");
	    // Create a CST Leaf
		if($IDGen != null) {
			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", $IDGen.text, IDGen.getCharPositionInLine(), IDGen.getLine());
			databaseReturnNode.getChildren().add(IDGenLeaf);
		}
		// Returns the Node with CST Leaves/Nodes
		$database.returnNode = databaseReturnNode;
	}
	;
	
table_and_implications returns [Node returnNode] 
:	 tableGen+=table  TK_0='('  implicationsGen+=implications  TK_1=')' 
	{
		// Create return CST Node
		Node table_and_implicationsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		table_and_implicationsReturnNode.setKind("table_and_implications");
	    // Create a CST Node
		if($tableGen != null) {
	        for(Iterator it = $tableGen.iterator(); it.hasNext(); )  { 
	            conexpParser.table_return r = (conexpParser.table_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("table");
	            	table_and_implicationsReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
	    // Create a Token CST Leaf	
	    if($TK_0 != null) {
			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", $TK_0.text, TK_0.getCharPositionInLine(), TK_0.getLine());
	 		table_and_implicationsReturnNode.getChildren().add(TK_0Leaf);
	 	}
	    // Create a CST Node
		if($implicationsGen != null) {
	        for(Iterator it = $implicationsGen.iterator(); it.hasNext(); )  { 
	            conexpParser.implications_return r = (conexpParser.implications_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("implications");
	            	table_and_implicationsReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
	    // Create a Token CST Leaf	
	    if($TK_1 != null) {
			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", $TK_1.text, TK_1.getCharPositionInLine(), TK_1.getLine());
	 		table_and_implicationsReturnNode.getChildren().add(TK_1Leaf);
	 	}
		// Returns the Node with CST Leaves/Nodes
		$table_and_implications.returnNode = table_and_implicationsReturnNode;
	}
	;

table returns [Node returnNode] 
:	 IDGen=ID 
	{
		// Create return CST Node
		Node tableReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		tableReturnNode.setKind("table");
	    // Create a CST Leaf
		if($IDGen != null) {
			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", $IDGen.text, IDGen.getCharPositionInLine(), IDGen.getLine());
			tableReturnNode.getChildren().add(IDGenLeaf);
		}
		// Returns the Node with CST Leaves/Nodes
		$table.returnNode = tableReturnNode;
	}
	;
	
implications returns [Node returnNode] 
:	( implicationGen+=implication)* 
	{
		// Create return CST Node
		Node implicationsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		implicationsReturnNode.setKind("implications");
	    // Create a CST Node
		if($implicationGen != null) {
	        for(Iterator it = $implicationGen.iterator(); it.hasNext(); )  { 
	            conexpParser.implication_return r = (conexpParser.implication_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("implication");
	            	implicationsReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
		// Returns the Node with CST Leaves/Nodes
		$implications.returnNode = implicationsReturnNode;
	}
	;
	
implication returns [Node returnNode] 
:	 noGen+=no  TK_0='<'  number_of_objectsGen+=number_of_objects  TK_1='>'  premiseGen+=premise  TK_2='==>'  conclusionGen+=conclusion  TK_3=';' 
	{
		// Create return CST Node
		Node implicationReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		implicationReturnNode.setKind("implication");
	    // Create a CST Node
		if($noGen != null) {
	        for(Iterator it = $noGen.iterator(); it.hasNext(); )  { 
	            conexpParser.no_return r = (conexpParser.no_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("no");
	            	implicationReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
	    // Create a Token CST Leaf	
	    if($TK_0 != null) {
			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", $TK_0.text, TK_0.getCharPositionInLine(), TK_0.getLine());
	 		implicationReturnNode.getChildren().add(TK_0Leaf);
	 	}
	    // Create a CST Node
		if($number_of_objectsGen != null) {
	        for(Iterator it = $number_of_objectsGen.iterator(); it.hasNext(); )  { 
	            conexpParser.number_of_objects_return r = (conexpParser.number_of_objects_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("number_of_objects");
	            	implicationReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
	    // Create a Token CST Leaf	
	    if($TK_1 != null) {
			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", $TK_1.text, TK_1.getCharPositionInLine(), TK_1.getLine());
	 		implicationReturnNode.getChildren().add(TK_1Leaf);
	 	}
	    // Create a CST Node
		if($premiseGen != null) {
	        for(Iterator it = $premiseGen.iterator(); it.hasNext(); )  { 
	            conexpParser.premise_return r = (conexpParser.premise_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("premise");
	            	implicationReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
	    // Create a Token CST Leaf	
	    if($TK_2 != null) {
			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", $TK_2.text, TK_2.getCharPositionInLine(), TK_2.getLine());
	 		implicationReturnNode.getChildren().add(TK_2Leaf);
	 	}
	    // Create a CST Node
		if($conclusionGen != null) {
	        for(Iterator it = $conclusionGen.iterator(); it.hasNext(); )  { 
	            conexpParser.conclusion_return r = (conexpParser.conclusion_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("conclusion");
	            	implicationReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
	    // Create a Token CST Leaf	
	    if($TK_3 != null) {
			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", $TK_3.text, TK_3.getCharPositionInLine(), TK_3.getLine());
	 		implicationReturnNode.getChildren().add(TK_3Leaf);
	 	}
		// Returns the Node with CST Leaves/Nodes
		$implication.returnNode = implicationReturnNode;
	}
	;

no returns [Node returnNode] 
:	 NUMBERGen=NUMBER 
	{
		// Create return CST Node
		Node noReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		noReturnNode.setKind("no");
	    // Create a CST Leaf
		if($NUMBERGen != null) {
			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", $NUMBERGen.text, NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
			noReturnNode.getChildren().add(NUMBERGenLeaf);
		}
		// Returns the Node with CST Leaves/Nodes
		$no.returnNode = noReturnNode;
	}
	;
	
number_of_objects returns [Node returnNode] 
:	 NUMBERGen=NUMBER 
	{
		// Create return CST Node
		Node number_of_objectsReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		number_of_objectsReturnNode.setKind("number_of_objects");
	    // Create a CST Leaf
		if($NUMBERGen != null) {
			Leaf NUMBERGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("NUMBER", $NUMBERGen.text, NUMBERGen.getCharPositionInLine(), NUMBERGen.getLine());
			number_of_objectsReturnNode.getChildren().add(NUMBERGenLeaf);
		}
		// Returns the Node with CST Leaves/Nodes
		$number_of_objects.returnNode = number_of_objectsReturnNode;
	}
	;
	
premise returns [Node returnNode] 
:	( attributeGen+=attribute+ |  TK_0='{'  TK_1='}') 
	{
		// Create return CST Node
		Node premiseReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		premiseReturnNode.setKind("premise");
	    // Create a CST Node
		if($attributeGen != null) {
	        for(Iterator it = $attributeGen.iterator(); it.hasNext(); )  { 
	            conexpParser.attribute_return r = (conexpParser.attribute_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("attribute");
	            	premiseReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
	    // Create a Token CST Leaf	
	    if($TK_0 != null) {
			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", $TK_0.text, TK_0.getCharPositionInLine(), TK_0.getLine());
	 		premiseReturnNode.getChildren().add(TK_0Leaf);
	 	}
	    // Create a Token CST Leaf	
	    if($TK_1 != null) {
			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf("TOKEN", $TK_1.text, TK_1.getCharPositionInLine(), TK_1.getLine());
	 		premiseReturnNode.getChildren().add(TK_1Leaf);
	 	}
		// Returns the Node with CST Leaves/Nodes
		$premise.returnNode = premiseReturnNode;
	}
	;
	
conclusion returns [Node returnNode] 
:	 attributeGen+=attribute+ 
	{
		// Create return CST Node
		Node conclusionReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		conclusionReturnNode.setKind("conclusion");
	    // Create a CST Node
		if($attributeGen != null) {
	        for(Iterator it = $attributeGen.iterator(); it.hasNext(); )  { 
	            conexpParser.attribute_return r = (conexpParser.attribute_return) it.next(); 
	            if(r != null && r.returnNode != null) {
	            	r.returnNode.setKind("attribute");
	            	conclusionReturnNode.getChildren().add(r.returnNode);
	            } 
	        }
	    }
		// Returns the Node with CST Leaves/Nodes
		$conclusion.returnNode = conclusionReturnNode;
	}
	;
	
attribute returns [Node returnNode] 
:	 IDGen=ID 
	{
		// Create return CST Node
		Node attributeReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		attributeReturnNode.setKind("attribute");
	    // Create a CST Leaf
		if($IDGen != null) {
			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf("ID", $IDGen.text, IDGen.getCharPositionInLine(), IDGen.getLine());
			attributeReturnNode.getChildren().add(IDGenLeaf);
		}
		// Returns the Node with CST Leaves/Nodes
		$attribute.returnNode = attributeReturnNode;
	}
	;

NUMBER 	
	:	'0'..'9'+
	;

ID
	:	('a'..'z' | 'A'..'Z')('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-')*
	;

WS
	:	( ' ' | '\t' | '\n' | '\r' )+ 
		{$channel=HIDDEN;}
	;