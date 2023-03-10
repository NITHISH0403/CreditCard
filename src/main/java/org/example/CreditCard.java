package org.example;

import java.util.logging.*;

class  CreditCard
{
    public static void main(String[] args)
    {
        Logger l = Logger.getLogger("My Logger");
        Card o1 = new Card();
        //call object clone().
        //clone o1.
        Card o2 = (Card) o1.clone();
        
        String holdername = "Holder Name :";
        String cardno = "Card No :";

        l.log(Level.INFO, () -> holdername + o1.hname + " " + cardno + o1.cno + " " + "Valid To:" + o1.vto );
        if(o1.hname.equals(o2.holderName) && o1.cno.equals(o2.cardNo) && o1.vto.equals(o2.validTo)){
            l.info("Your Co-ordinates is True.");
            l.log(Level.INFO, () -> holdername + o1.hname + " " + cardno + "y1:" + o1.cno);
            l.log(Level.INFO, () -> holdername + o1.holderName + " " + cardno +o1.cardNo);
        }
        else {
            l.info("Your Co-ordinates is False.");
            l.log(Level.INFO, () -> holdername + o1.holderName + " " + cardno + o1.cardNo);
            l.log(Level.INFO, () -> holdername + o1.hname + " " + cardno + o1.cno);
        }

    }
}
