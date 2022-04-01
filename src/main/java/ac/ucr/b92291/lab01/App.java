/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b92291.lab01;

/**
 *
 * @author PC
 */
public class App {

    public static void main(String args[]) {

//    LotteryNumber today = new LotteryNumber();
//    today.number=98;
//     LotteryNumber tomorrow = new LotteryNumber();
//    today.number=03;
//    today.add(tomorrow);
//    today = new LotteryNumber();
        LotteryNumber first = new LotteryNumber(98);
        first.add(new LotteryNumber(03));
        first.add(new LotteryNumber(33));
        first.add(new LotteryNumber(45));
        first.add(new LotteryNumber(67));
        first.add(new LotteryNumber(98));
        first.print();
        System.out.println(first.find(98));
    }

}
