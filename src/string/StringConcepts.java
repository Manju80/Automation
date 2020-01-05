package string;

/*
public class StringConcepts {
* 
* String is a special class in Java which is present in java.lang package
* String is a final class in Java which is immutable means once string object is created it cannot be changed
* Except String everything is mutable
* 
* String objects are created in two different ways:
* 
*  String name = "Manjunath Reddy";
*  
*  This string object is created in string static pool
*  
*  String name= new String ("Manjunath Reddy");
*  This string object is created in Heap memory
*  
*  String values can be changed in heap but not in string static pool
*  
*  String class has lot of overloaded constructors
*  == (equals method) present in string class always checks for references not the string content
*  .equals() method present in string class checks for actual string object content
*  
*  String name = new String("manju");
*  name=name.toUpperCase();
*  
*  This converts string value into uppercase.
*  
* There are 3 types of strings in Java
* 1) String
* 2)StringBuffer
* 3)StringBuilder
* 
* String Builder:
* 
* String builder is immutable class in Java means string object created can be modified
* String builder is multithreaded
* String builder is not synchronized or thread safe.
* 
* String Buffer:
* 
* String buffer is immutable class in Java means string object can be modified
* String buffer is single threaded or thread safe
* String buffer is synchronized
* 
* Note:
* 
* Equals method is defined in parent most class  in java.lang.object and it is overridden in string class
* The String functionalities can be even done by String builder and string buffer
* String is immutable rather StringBuilder and StringBuffer are mutable
* Difference between StringBuilder and StringBuffer is StringBuffer is single threaded/Thread safe/Synchronized whereas StringBuilder is multithreaded/Non synchronized/Not Threadsafe
* If we are dealing too much with string then it is better to use StringBuilder.
* 
* toString() method is present in String superclass object 
* 
* String Methods:
* charAt(Index)
* IndexOf();
* lastIndexOf();
* startsWith();
* endsWith();
* contains();
* length();
* trim();
* SubString();
* lengthOf();
* split();
* 
* StringBuffer Methods:
* reverse();
* delete();
* insert();
* replace();
* append();
* deleteCharAt();
*
*StringBuffer and StringBuilder have same operations/Methods
*
*StringTokenizer:

*StringTokenizer belongs to java.lang.util package used to split data
*StringTokenizer is a legacy class(1.5 version) used to split data the default spliting is space character
*The methods present in StringTokenizer class are:
*1)hasmoreElements() returns boolen value True/False accordingly
*2)nextElement() 
*
*String class entire content is fixed in the project
*StringBuffer entire content changing but threadSafe used.
*String Class equals method performs content comparison but in StringBuffer equals method performs reference comparison.
*
*/



