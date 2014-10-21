
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Data implements Money{
    public final int SIZE;
    public double[][] data;
    public String[] date;
    
    public Data(Input i){
        this.SIZE = 2;
        this.data = new double[SIZE][i.getAmountdate()];
        this.date = new String[i.getAmountdate()];
    }

    @Override
    public void setData(Input i) {
        Scanner scan = new Scanner(System.in);
        for(int j = 0; j < i.getAmountdate();j++){
            byte k = scan.nextByte();
            if(k == 0){
                this.data[k][j] = scan.nextDouble();
            }else if(k == 1){
                this.data[k][j] = scan.nextDouble();
            }
        }
    }

    @Override
    public void setDate(Input i) {
        
    }
}
