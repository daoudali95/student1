package com.company;

import java.util.*;

public class S3_runner {

    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to enter any courses?");
        System.out.println("enter 1 for Yes and 0 for No");


        Set<String> student = new HashSet<>();
        Set<String> sub = new HashSet<>();
        int input = scan.nextInt();
        if(input==1){

            for (int i=0; i<10; i++){
                System.out.println("enter course or enter cl to complete");
                String c = scan.nextLine();

                if (student.contains(c)) {
                    System.out.println(c + " is already selected");
                    i = i - 1;
                    continue;
                }
                else if (c.equals("cl")){
                    break;
                }

                else {
                    student.add(c);
                }
            }

        }

        else{
            System.out.println("Thank you for your time");
            System.exit(0);
        }

        Student3 st = new Student3();

        System.out.println("enter Your name:");
        String name1 = scan.nextLine();
        System.out.println("Enter Your age");
        int age1 = scan.nextInt();
        System.out.println("Enter Your roll no.");
        int r_num = scan.nextInt();
        System.out.println("enter your University name:");
        String uni = scan.nextLine();
        System.out.println();

        st.setName(name1);
        st.setAge(age1);
        st.setRoll_n(r_num);
        st.setUni_name(uni);

        System.out.println();
        System.out.println("Choose the courses which you want to learn or enter 0 for complete:");
        System.out.println();

        List<String> stu = new ArrayList<String>(student);


        System.out.println(stu.size());

        int a = 1;
        for(String subject : student) {
            System.out.print(a +"."+ subject+"  ");
            a++;
        }

        System.out.println();
        System.out.println();

        for (int k = 0; k < stu.size(); k++) {

            try {
                Scanner scan1 = new Scanner(System.in);
                System.out.println("enter your choice");
                int input1 = scan1.nextInt();
                String sb = stu.get(input1);
                if(input1 > stu.size()){
                    System.out.println("that index did,nt exist");
                    System.out.println("choose again");
                    k = k - 1;
                    continue;
                }
                 if(input1 < stu.size()) {
                     sub.add(sb);
                }
                if (input1==0){
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Please choose the course's index number");
                k = k - 1;
                continue;
            }

        }

        System.out.println();
        System.out.println();
        System.out.println("your information:");
        System.out.println("Name: "+st.getName());
        System.out.println("Age: "+st.getAge());
        System.out.println("Roll number: "+st.getRoll_n());
        System.out.println("Your university name: "+st.getUni_name());
        System.out.println("the courses you choosed: ");
        System.out.println(sub);


    }

}
