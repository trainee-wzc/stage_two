package com.itheima.d2_collectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    private List<Card> cards = new ArrayList<>();

    // 用无参构造器来实现一副牌，在房间对象被创建出来的时候就会生成。
    public Room(){
        String[] numbers ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♠","♥","♣","♦"};
        int size = 0;

        // 两个增强for循环来遍历元素，当然也可以用for i 循环
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card c = new Card(number,color,size);
                cards.add(c);
            }

        }
        // 大小王默认只有花色，单独拿出来创建
        Card c1 = new Card("","♟",++size);
        Card c2 = new Card("","♛",++size);
        Collections.addAll(cards,c1,c2);
        System.out.println("新的一副牌：" + cards);
    }

    public void start() {
        // 1.洗牌
        Collections.shuffle(cards);
        System.out.println("洗好的新牌：" + cards);

        // 2.发牌
        List<Card> lingHuChi = new ArrayList<>();
        List<Card> jiuMoZhi = new ArrayList<>();
        List<Card> renYingYing = new ArrayList<>();
        for (int i = 0; i < cards.size() - 3; i++) {
            Card c = cards.get(i);
            switch (i%3){
                case 0:
                    lingHuChi.add(c);
                    break;
                case 1:
                    jiuMoZhi.add(c);
                    break;
                case 2:
                    renYingYing.add(c);
                    break;
            }
        }
        // 3.对玩家获得的手牌进行排序
        sortCards(lingHuChi);
        sortCards(jiuMoZhi);
        sortCards(renYingYing);


        // 4.看看每个玩家的牌
        System.out.println("令狐冲的牌：" + lingHuChi);
        System.out.println("鸠摩智的牌：" + jiuMoZhi);
        System.out.println("任盈盈的牌：" + renYingYing);
        List<Card> bottom = cards.subList(cards.size()-3,cards.size());
        System.out.println("底牌：" + bottom);
    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                if(o1.getSize() != o2.getSize()){
                    return o1.getSize() - o2.getSize();
                }else{
                    return colorSort(o1) - colorSort(o2);
                }

            }
        });
    }
    
    private int colorSort(Card c1){
        // 黑红梅方的顺序对花色进行排序
        int colorSize = 0;
        switch (c1.getColor()){
            case "♠":
                colorSize = 0;
                break;
            case "♥":
                colorSize = 1;
                break;
            case "♣":
                colorSize = 2;
                break;
            case "♦":
                colorSize = 3;
                break;
                
        }
        return colorSize;
    }
}
