/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variantb.one.main;

import variantb.one.action.Action;

/**
 *
 * @author SLAVA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Action action=new Action();
        action.setK(34);
        action.setN(23);
        action.setM(422);
        action.ResInterval(action.getK(),action.getN(),action.getM());
    }
}
