    // 붕대에 의한 회복 구현
        // 1초에 정해진 만큼 회복
        // 끝났을때 추가 회복
    // 공격 구현 
        // 공격타이밍 잡기
        // 공격시 체력감소
        // 공격시 회복 중단

import java.lang.Math;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int count = 1;
        int nowHealth = health;
        int attackIndex = 0;
        for (int i = 1; i < attacks[attacks.length - 1][0] + 1; i++){
            if (i == attacks[attackIndex][0]) {
                nowHealth -= attacks[attackIndex++][1];
                if (nowHealth <= 0) {
                    nowHealth = -1;
                    break;
                }
                count = 1;
            }
            else{
                nowHealth = heal(bandage, nowHealth, health, count++);
            }
        }
        return nowHealth;
    }

    private int heal(int[] bandage, int nowHealth, int health, int count) {
        if(count % bandage[0] == 0) {
            nowHealth = Math.min(nowHealth + bandage[1] + bandage[2], health);
        }
        else {
            nowHealth = Math.min(nowHealth + bandage[1], health);
        }
        return nowHealth;
    }
    

    
}