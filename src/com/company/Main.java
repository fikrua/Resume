package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Resume resume1 = new Resume();
        Scanner scanner = new  Scanner(System.in);
        String education1 = "";
        String unveristy1="";
        int year1 = 0;
         String experience1 = "";
        String startDate1 ="";
         String endDate1 ="";
         String duty1_1="";
        String duty2_1 = "";
         String workPlace_1 = "";
        String experience2 = "";
        String startDate2 ="";
        String endDate2 ="";
        String duty1_2="";
        String duty2_2 = "";
        String workPlace_2 = "";


        //Resume resume = new Resume();
        ArrayList<Resume> resumelist = new ArrayList<Resume>();
        boolean done = false;
        int count = 1;
        while(!done ){
            Resume resume = new Resume();
            System.out.println("enter your name ");
            String name = scanner.nextLine();
            System.out.println("enter your email ");
            String email = scanner.nextLine();
            System.out.println("enter your education ");
            String education = scanner.nextLine();
            System.out.println("enter your univeristy ");
            String unveristy = scanner.nextLine();
            System.out.println("enter year of graduation");
            int year = scanner.nextInt();
            System.out.println("do you have other education y/n");
            scanner.nextLine();
            String check= scanner.nextLine();
            if(check.equalsIgnoreCase("y")){
                System.out.println("enter your education ");
                 education1 = scanner.nextLine();
                System.out.println("enter your univeristy ");
                unveristy1 = scanner.nextLine();
                System.out.println("enter year of graduation");
                year1 = scanner.nextInt();

            }

            System.out.println("enter your exipriance ");
           // scanner.nextLine();
             String experience = scanner.nextLine();
            System.out.println("enter the organazetion you work ");
            String whereyou = scanner.nextLine();
            System.out.println("start date  ");
            String sdate = scanner.nextLine();
            System.out.println("end date ");
            String enddate= scanner.nextLine();
            System.out.println("your first duty ");
            String duty1= scanner.nextLine();
            System.out.println("your seconed duty");
            String duty2= scanner.nextLine();
            System.out.println("do you have other experience y/n");
            String check2= scanner.nextLine();
            if(check2.equalsIgnoreCase("y")){
                System.out.println("enter your exipriance ");
                //scanner.nextLine();
                experience1 = scanner.nextLine();
                System.out.println("enter the organazetion you work ");
                workPlace_1 = scanner.nextLine();
                System.out.println("start date  ");
                 startDate1 = scanner.nextLine();
                System.out.println("end date ");
                endDate1= scanner.nextLine();
                System.out.println("your first duty ");
                 duty1_1= scanner.nextLine();
                System.out.println("your seconed duty");
                 duty2_1= scanner.nextLine();
                System.out.println("do you have other experience y/n");
                String check3= scanner.nextLine();
                if(check3.equalsIgnoreCase("y")){
                    System.out.println("enter your exipriance ");
                    experience2 = scanner.nextLine();
                    System.out.println("enter the organazetion you work ");
                    workPlace_2 = scanner.nextLine();
                    System.out.println("start date  ");
                    startDate2 = scanner.nextLine();
                    System.out.println("end date ");
                    endDate2= scanner.nextLine();
                    System.out.println("your first duty ");
                    duty1_2= scanner.nextLine();
                    System.out.println("your seconed duty");
                    duty2_2= scanner.nextLine();

                }

            }
            System.out.println("enter first skill ");
            String skill = scanner.nextLine();
            System.out.println("enter your seconed skill ");
            String seconedskill= scanner.nextLine();
            System.out.println("enter your therid skill");
            String skill3 = scanner.nextLine();

            resume.profile.setName(name);
            resume.profile.setEmail(email);
            resume.education.setEducation(education);
            resume.education.setUniveristy(unveristy);
            resume.education.setYear(year);
            resume.education1.setEducation(education1);
            resume.education1.setUniveristy(unveristy1);
            resume.education1.setYear(year1);
            resume.experience.setExperience(experience);
            resume.experience.setWorkPlace(whereyou);
            resume.experience.setStartDate(sdate);
            resume.experience.setEndDate(enddate);
            resume.experience.setDuty1(duty1);
            resume.experience.setDuty2(duty2);
            resume.experience1.setExperience(experience1);
            resume.experience1.setWorkPlace(workPlace_1);
            resume.experience1.setStartDate(startDate1);
            resume.experience1.setEndDate(endDate1);
            resume.experience1.setDuty1(duty1_1);
            resume.experience1.setDuty2(duty2_1);
            resume.experience2.setExperience(experience2);
            resume.experience2.setWorkPlace(workPlace_2);
            resume.experience2.setStartDate(startDate2);
            resume.experience2.setEndDate(endDate2);
            resume.experience2.setDuty1(duty1_2);
            resume.experience2.setDuty2(duty2_2);
            resume.skill.setSkill(skill);
            resume.skill.setSkill2(seconedskill);
            resume.skill.setSkill3(skill3);



            resumelist.add(resume);



            System.out.println("if  you want continue for another resume  y/n");
            String yes = scanner.nextLine();
            if(yes.equalsIgnoreCase("y"))
                done = false;
            else
                done = true;



        }
        System.out.println();
        for(Resume r: resumelist){
            System.out.println(r.profile.getName()+"\n"+r.profile.getEmail()+"\n");

            System.out.println("Education\n"+r.education.getEducation()+",\n"+r.education.getUniveristy()+", "+r.education.getYear()+"\n");
            if(!r.education1.getEducation().isEmpty()){
                System.out.println(r.education1.getEducation()+",\n"+r.education1.getUniveristy()+", "+r.education1.getYear()+"\n");

            }



            System.out.println("EXPERIENCE \n"+r.experience.getExperience()+"\n"+r.experience.getWorkPlace()+", "+r.experience.getStartDate()+
            " - "+r.experience.getEndDate()+"\n-Duty 1, "+r.experience.getDuty1()+"\n-Duty 2, "+r.experience.getDuty2()+"\n");


            if(r.experience1.getExperience()== null){
                System.out.println(r.experience1.getExperience()+"\n"+r.experience1.getWorkPlace()+", "+r.experience1.getStartDate()+
                        " - "+r.experience1.getEndDate()+"\n-Duty 1, "+r.experience1.getDuty1()+"\n-Duty 2, "+r.experience1.getDuty2()+"\n");
            }

            if(r.experience2.getExperience()== null){
                System.out.println(r.experience2.getExperience()+"\n"+r.experience2.getWorkPlace()+", "+r.experience2.getStartDate()+
                        " - "+r.experience2.getEndDate()+"\n-Duty 1, "+r.experience2.getDuty1()+"\n-Duty 2, "+r.experience2.getDuty2()+"\n");

            }




            System.out.println("SkilLS\n"+r.skill.getSkill()+"\n"+r.skill.getSkill2()+"\n"+r.skill.getSkill3());


        }
    }
}
