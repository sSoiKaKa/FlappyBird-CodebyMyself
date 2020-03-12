public class Score {

    private static  int score = 0;
    private Bird birdS = new Bird();
    private WaterPipe waterPipeS = new WaterPipe();
    private static boolean bl = false;

    // lay gia tri cua diem
    public static int getScore(){
        return score;
    }

    // cong diem khi qua moi ong nuoc
    public void addScore(){

        // ong nuoc 1
        if(birdS.getX() == waterPipeS.getX1() +50){
            bl = true;
        }
        if (bl == true && birdS.getX() > waterPipeS.getX1() + 50){
            score++;
            bl = false;
        }

        //ong nuoc 2
        if(birdS.getX() == waterPipeS.getX2() +50){
            bl = true;
        }
        if (bl == true && birdS.getX() > waterPipeS.getX2() + 50){
            score++;
            bl = false;
        }

        // ong nuoc 3
        if(birdS.getX() == waterPipeS.getX3() +50){
            bl = true;
        }
        if (bl == true && birdS.getX() > waterPipeS.getX3() + 50){
            score++;
            bl = false;
        }

    }
}
