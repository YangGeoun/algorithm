class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        // String -> int (계산의 속도, 편의를 위해)
        int intVideoLen = toIntTime(video_len);
        int intPos = toIntTime(pos);
        int intOpStart = toIntTime(op_start);
        int intOpEnd = toIntTime(op_end);
        
        // 시작시 오프닝 구간인지 검사
        if (intOpStart <= intPos && intPos < intOpEnd) {
            intPos = intOpEnd;
        }
        
        for (String command : commands) {
            // command 실행
            switch (command) {
                case "next":
                    intPos += 10;
                    if (intPos > intVideoLen) intPos = intVideoLen;
                    break;
                case "prev":
                    intPos -= 10;
                    if (intPos < 0) intPos = 0;
                    break;
                default:
                    System.out.println("400 : commands 입력 오류 발생");
            }
            
            // 매 이동마다 오프닝 구간인지 검사
            if (intOpStart <= intPos && intPos < intOpEnd) {
                intPos = intOpEnd;
            }
        }
        String answer = toStringTime(intPos);
        
        
        return answer;
    }
    
    private int toIntTime(String time) {
        int seconds = Integer.parseInt(time.substring(0,2)) * 60;
        seconds += Integer.parseInt(time.substring(3,5));
        return seconds;
    }
    
    private String toStringTime(int seconds) {
        String time = "";
        int min = seconds / 60;
        if (min < 10) {
            time += "0";
            time += min;
        } else {
            time += min;
        }
        time += ":";
        int sec = seconds % 60;
        if (sec < 10) {
            time += "0";
            time += sec;
        } else {
            time += sec;
        }
        
        return time;
    }
}