import java.util.*;

public class Kullanicigirisi {
    
    static String ID,PW,id,pw;
    static boolean logCheck;
    static Scanner scan =new Scanner(System.in);


    static void signIn(){

       System.out.println("Kayıt için kullanıcı adı giriniz:");
                        id=scan.nextLine();

                        System.out.println("Kayıt için şifre giriniz : ");
                        pw=scan.nextLine();
        
        logIn();
    }

    static boolean logIn(){
        String pwChange;
        System.out.println("Giriş için kullanıcı adı giriniz:");
                        ID=scan.nextLine();

                        System.out.println("Giriş için şifre giriniz : ");
                        PW=scan.nextLine();

        if(id.equals(ID) && pw.equals(PW)){
            
            logCheck=true;
        }else if(id.equals(ID) && !pw.equals(PW)){
            
            System.out.println("Hatalı Şifre. Şifre yenilemek ister misiniz?\n1-Evet\n2-Hayır");
            if(scan.nextInt()==1){
               System.out.println("Yeni bir şifre giriniz:");
               scan.next();
               pwChange=scan.nextLine();

               do{
                 System.out.println("Lütfen farklı bir şifre giriniz.");
                 pwChange=scan.nextLine();
               }while(pw.equals(pwChange));

               pw=pwChange;               
               System.out.println("Şifreniz başarıyla değişti.");
              
            }

            logCheck=false;

        }else{
            System.out.println("Kullanıcı adı veya şifre hatalı. Tekrar deneyiniz.\n\n**********");
        }
                        
                
       return logCheck;
    }
    public static void main(String[] args) {
        
        signIn();

        while(logCheck){     
            System.out.println("Başarıyla giriş yaptınız.");
            scan.close();
        }


    }
}
