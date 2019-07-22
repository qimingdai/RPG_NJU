package games.bag;

import java.util.ArrayList;

public class Bag {
    private ArrayList arrayList=new ArrayList();
    public void add(Object o){
        if(arrayList.size()<10){
            arrayList.add(o);
        }else {
            //提示背包空间不足
            System.out.println("背包所剩空间不足");
        }
    }
    public void sold(Object o){
        arrayList.remove(o);
        //提示成功售出
    }

}
