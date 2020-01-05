package xpath;

//public class XpathSelectListOptions {

//Child axis / it navigates from any element(parent) to its immediate child element
		
		//  /html/child::body/child::select/child::option      o/p:It shows or matches all the 5 options/elements
		 // /html/child::body/child::/select/child::option[1]  o/p: It will navigate to child1 Jan
		 // /html/child::body/child::/select/child::option[2]  o/p: It will navigate to child2 Feb
		 // /html/child::body/child::/select/child::option[3]  o/p: It will navigate to child3 Mar
		 // /html/child::body/child::/select/child::option[4]  o/p: It will navigate to child4 Apr
		 // /html/child::body/child::/select/child::option[5]  o/p: It will navigate to child5 May

// Simplified: /html/body/select/option[1]
		 
// Parent axis /.. it navigates from any element(child) to its next immediate parent

//option/..
// //option[1]/.. o/p: It will navigate to immediate parent Select
// //option[2]/.. o/p: It will navigate to immediate parent Select
// //option[3]/.. o/p: It will navigate to immediate parent Select
// //option[4]/.. o/p: It will navigate to immediate parent Select
// //option[5]/.. o/p: It will navigate to immediate parent Select
// //option[1]/../.. o/p: It will navigate to immediate parent body
// //option[2]/../.. o/p: It will navigate to immediate parent body
// //option[3]/../.. o/p: It will navigate to immediate parent body
// //option[4]/../../.. o/p: It will navigate to immediate parent html
// //option[5]/../../.. o/p: It will navigate to immediate parent html

//Descendant descendant axis It navigates from any element on webpage to any child//

// html/descendent :: option[1]   o/p:Jan
// html/descendent :: option[2]   o/p:Feb
// html/descendent :: option[3]   o/p:Mar
// html/descendent :: option[4]   o/p:Apr
// html/descendent :: option[5]   o/p:May

//Simplified: /html//option[5]

// Ancestor axis It navigates from any element on webpage to any parent

// //option[1]/ancestor :: body o/p:it navigates to body parent from option[1] element
// //option[1]/ancestor :: html o/p: it navigates to html parent from option[2] element

//following-sibling axis It represent the elements which are present below specified element of same parent

//  //option[1]/following-sibling :: option[2] o/p:Mar
// //option[1]/following-sibling :: option[3]  o/p:Apr
// //option[1]/following-sibling::option[4]    o/p:May
// //option[3]/following-sibling::option[2]    o/p: May
// //option[2]/following-sibling::option[2]    o/p: Apr

//preceding-sibling axis It represents the elements which are present above the specified element of the same parent on the web page HTML tree structure

//  //option[3]/preceding-sibling:: option[1] o/p: Feb
//  //option[4]/preceding-sibling::option[2] o/p: Mar
// //option[5]/preceding-sibling::option[3] o/p: Feb
