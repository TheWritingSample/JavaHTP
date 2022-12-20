public class MadLibs {
  /*
  Your description here
  This program generates a mad libbed story.
  Author: Andrew
  Date: 12/19/2022
  */
  	public static void main(String[] args){
      String name1 = "Andrew";
      String name2 = "Jennifer";
      String adjective1 = "blue";
      String adjective2 = "green";
      String adjective3 = "red";
      String verb1 = "running";
      String noun1 = "cave";
      String noun2 = "mountain";
      String noun3 = "snow";
      String noun4 = "desert";
      String noun5 = "tower";
      String noun6 = "button";
      int number = 4;
      String place1 = "Maine";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);

      
    }       
}
