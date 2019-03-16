package games.monster.pool;


import games.monster.Monster;
import games.monster.factory.*;
import sun.nio.ch.ThreadPool;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;


public class MonsterPool {
    private LinkedList<Monster> monsterList = new LinkedList();
    private LinkedList<Monster> stateList = new LinkedList();
    //池的总大小
    private int corePoolSize;
    private int maxmumPoolSize;
    private MonsterFactory monsterFactory;

    public MonsterPool(int corePoolSize, int maxmumPoolSize){
        this.corePoolSize=corePoolSize;
        this.maxmumPoolSize=maxmumPoolSize;
    }

    public void setMonsterFactory(MonsterFactory monsterFactory){
        this.monsterFactory=monsterFactory;
    }

    public synchronized List getMonster(int size,int level){
        if(monsterList.size()+stateList.size()+size>maxmumPoolSize){
            throw new RuntimeException("抛异常");
        }
        LinkedList<Monster> relist = new LinkedList<>();
        if(monsterList.size()>=size){
            for(int i=0;i<size;i++){
                Monster monster = monsterList.removeFirst();
                stateList.addLast(monster);
                relist.addLast(monster);
            }
        }else{
            for(int i=0;i<monsterList.size();i++){
                Monster monster = monsterList.removeFirst();
                stateList.addLast(monster);
                relist.addLast(monster);
            }
            for(int i=0;i<size-monsterList.size();i++){
                Monster e = monsterFactory.createMonster(level);
                stateList.addLast(e);
                relist.addLast(e);
            }
        }
        return relist;
    }

    public void destroyMonster(Monster monster){
        stateList.remove(monster);
        Monster m = inti(monster);
        monsterList.addLast(m);
//        System.out.println("现在的空闲队列："+monsterList);
//        System.out.println("现在的工作队列"+stateList);
    }

    public void cleanPool(){
        while(monsterList.size()>corePoolSize){
            monsterList.removeLast();
        }
    }

    public Monster inti(Monster monster){
        //写死的，有问题
        monster.setHP(1000);
        return monster;
    }

}
