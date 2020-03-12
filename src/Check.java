public class Check {
    private Bird birdC = new Bird();
    private WaterPipe waterPipeC = new WaterPipe();

    public  boolean dead(){
        // khi chim cham dat
        if(birdC.getY() + 30 >= 350){
            return true;
        }

        // khi chim cham ong nuoc1
        if(birdC.getY() <= waterPipeC.getH1() &&(((birdC.getX()+50) >= waterPipeC.getX1())) && birdC.getX() <= (waterPipeC.getX1()+50)){
            return true;
        }
        if((birdC.getY()+30) >= (waterPipeC.getH1()+130) && ((birdC.getX()+50) >= waterPipeC.getX1() && birdC.getX() <= (waterPipeC.getX1()+50))){
            return true;
        }

        // ong nuoc2
        if(birdC.getY() <= waterPipeC.getH2() &&(((birdC.getX()+50) >= waterPipeC.getX2())) && birdC.getX() <= (waterPipeC.getX2()+50)){
            return true;
        }
        if((birdC.getY()+30) >= (waterPipeC.getH2()+130) && ((birdC.getX()+50) >= waterPipeC.getX2() && birdC.getX() <= (waterPipeC.getX2()+50))){
            return true;
        }

        // ong nuoc3
        if(birdC.getY() <= waterPipeC.getH3() &&(((birdC.getX()+50) >= waterPipeC.getX3())) && birdC.getX() <= (waterPipeC.getX3()+50)){
            return true;
        }
        if((birdC.getY()+30) >= (waterPipeC.getH3()+130) && ((birdC.getX()+50) >= waterPipeC.getX3() && birdC.getX() <= (waterPipeC.getX3()+50))){
            return true;
        }
        return false;
    }
}
