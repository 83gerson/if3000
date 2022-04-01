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
public class LotteryNumber {

    public LotteryNumber(int number) {
        this.number = number;
    }

    LotteryNumber next = null;
    int number = 0;

    public void add(LotteryNumber next) {
        if (this.next == null) {
            this.next = next;
//            print();
        } else {
            this.next.add(next);

        }
    }

    public void print() {

        System.out.println(number);
        if (next != null) {
            next.print();
        }
    }

    public boolean find(int num) {
//        if (number == num) {
//            return true;
//        }
//        return false;
        if (this.number == num) {
            return true;
        } else {
            if (this.next != null) {
                return next.find(num);
            } else {

            }
            return false;
        }

    }

}
