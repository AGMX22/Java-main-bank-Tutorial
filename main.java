import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Bank bank=new Bank("CIMB","CMBHQ"); //Create Bank object
        Branch branch=bank.addbranch("CIMB Kajang","Kajang","CIMBKJ"); //Add new branch for that bank

        SavingAcc sav_acc=branch.openSavAcc("Tan Wei Hao","010210-10-2992","982932191",100);  //open saving acc at branch
        SavingAcc sav_acc1=branch.openSavAcc("Lee","013410-10-4392","0123993112",100);
        CurrentAcc cur_acc=branch.openCurAcc("Kenny","023921-10-2931","2933292393",100); //open current acc at branch
        sav_acc.addinterest();  //add interest to saving acc

        ArrayList<Account> customer=branch.getCustomer_list(); //display customer list

        cur_acc.transfer(50,"0123993112",customer); //make transfer
        System.out.println(cur_acc.getBalance()); //Balance after transfer



    }
}
