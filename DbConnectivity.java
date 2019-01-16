package sample;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient; 
	import com.mongodb.MongoCredential;  

	public class  DbConnectivity { 
	   
	   public static void main( String args[] ) {  
	      MongoClient mongo= new MongoClient( "localhost" , 27017 );  
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("", "myDb", 
	         "".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      MongoDatabase database = mongo.getDatabase("myDb1"); 
	      System.out.println("Database selected successfully");
	      
	      //database.createCollection("first");
	     MongoCollection<Document> collection = database.getCollection("first"); 
	      System.out.println("Collection selected successfully");
//
//	      Document document = new Document("name", "ARun") 
//	    	      .append("id", 2019)
//	    	      .append("dept", "Maths")  ;
//    	      collection.insertOne(document);
//    	      System.out.println("Document Inserted successfully");
    	      FindIterable<Document> iterDoc = collection.find(); 
    	    

    	      Iterator it = iterDoc.iterator(); 
    	    
    	      while (it.hasNext()) {  
    	         System.out.println(it.next());  
    	     
    	      }
    	      
    	      collection.updateOne(Filters.eq("name", "Guru"), Updates.set("name", "guru"));       
    	      System.out.println("Document update successfully..."); 
	   } 
	}
