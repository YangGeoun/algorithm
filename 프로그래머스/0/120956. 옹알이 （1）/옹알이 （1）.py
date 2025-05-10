def solution(babbling):
    answer = 0
    word = ["aya","ye","woo","ma"]  
    for i in babbling:              
        for j in word:              
            i = i.replace(j,'*',1)   
        if i.replace('*','') == '':   
            answer += 1    
    return answer