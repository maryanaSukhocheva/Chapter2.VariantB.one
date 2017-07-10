package variantb.one.action;

/**
 *
 * @author SLAVA
 */
public class Action {
    private int k,n,m;
    public Action() {
    }
    public int getK() {
        return k;
    }
   
    public final void setK(int k) {
       this.k = k;
    }
    
    public int getN() {
        return n;
    }

    
    public final void setN(int n) {
       this.n = n;
    }
   
    public int getM() {
        return m;
    }

    
    public final void setM(int m) {
       this.m = m;
    }
 
     public void resultInterval(int k,int n,int m){
         if ((k > n) && (k <= m)){ //(n, m]
             System.out.println("Число " + k + " принадлежит интервалу (" + n + "," + m + "]");
         }
         if ((k >= n) && (k < m)) { //[n,m)
             System.out.println("Число " + k + " принадлежит интервалу [" + n + "," + m + ")");
         }
         if ((k > n) && (k < m)) { //(n, m)
             System.out.println("Число " + k + " принадлежит интервалу (" + n + "," + m + ")");
         }
         if ((k >= n) && (k <= m)) { //[n, m]
             System.out.println("Число " + k + " принадлежит интервалу [" + n + "," + m + "]");
         }
      }   
      }   
   