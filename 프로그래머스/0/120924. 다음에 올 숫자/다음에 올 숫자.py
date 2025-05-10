def solution(common):
    answer = 0
    a = common[0]
    d = common[1] - common[0]
    if (common[1] != 0):
        r = common[2] / common[1]
        if (common[1] == common[0] * r):
            answer = common[-1] * r
    elif (common[0] != 0):
        r = common[1] / common[0]
        if (common[2] == common[1] * r):
            answer = common[-1] * r
        
            
    
    if (common[2] == common[1] + d):
        answer = common[-1] + d

    return answer

