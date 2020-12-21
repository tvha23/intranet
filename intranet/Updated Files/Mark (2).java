package intranet;


public class Mark { 
  private double mark; 
  private double firstAtt; 
  private double secondAtt; 
  private double finalExam; 
  private double gpa; 
  
    /** 
     * Default constructor 
     */ 
    public Mark() { 
    } 

    public double getFirstAtt() {
  return firstAtt;
 }


 public void setFirstAtt(double firstAtt) {
  this.firstAtt = firstAtt;
 }


 public double getSecondAtt() {
  return secondAtt;
 }


 public void setSecondAtt(double secondAtt) {
  this.secondAtt = secondAtt;
 }


 public double getFinalExam() {
  return finalExam;
 }


 public void setFinalExam(double finalExam) {
  this.finalExam = finalExam;
 }


 public void setMark(double mark) {
  this.mark = mark;
 }


 public void setGpa(double gpa) {
  this.gpa = gpa;
 }


 /** 
     * @return 
     */ 
    public double getGpa() { 
        // TODO implement here 
        return 0.0d; 
    } 
 
    /** 
     * @return 
     */ 
    public String toLetter() { 
     if (mark >= 95 && mark <= 100) 
          return "A"; 
         if (mark >= 90) 
          return "A-"; 
         if (mark >= 85) 
          return "B+"; 
         if (mark >= 80) 
          return "B"; 
         if (mark >= 75) 
          return "B-"; 
         if (mark >= 70) 
          return "C+"; 
         if (mark >= 65) 
          return "C"; 
         if (mark >= 60) 
          return "C-"; 
         if (mark >= 55) 
          return "D+"; 
         if (mark >= 50) 
          return "D"; 
         else  
          return "F"; 
       }


 
    /** 
     * @return 
     */ 
    public double getMark() { 
    	return this.mark;
    } 
 
}