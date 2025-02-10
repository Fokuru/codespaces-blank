package ScheduleChecker;

import java.util.ArrayList;

public class SchChe {
    //precondition: Imput an array of MeetingIntervals with atleast 1 object.
	//postcondition: Gives back 'true' if none of the meetings interfear with eachother, 'false' if they do.
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		//your implementation here
        for (int k = 0; k < meetings.size()-1; k++)
            {
            for (int i = 0; i < meetings.size()-1; i++){
                if (meetings.get(i).getStart() > meetings.get(i+1).getStart()){
                    MeetingInterval first = meetings.get(i);
                    meetings.set(i, meetings.get(i+1));
                    meetings.set(i+1, first);
                }
            }
        }

        for (int j = 0; j < meetings.size()-1; j++)
        {
            if (meetings.get(j).getEnd() > meetings.get(j+1).getEnd())
            {
                return false;
            }
        }
		return true; //replace me with actual logic please!
	}

    //precondition: 
	//postcondition: 
	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<3; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
		//please include additional testing here!

        ArrayList<MeetingInterval> meet2 = new ArrayList<MeetingInterval>();
        for(int i =0; i<5; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet2.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet2) ? "There is no conflict with attending "+meet2+" meetings":"Can't attend "+meet2+" meetings due to conflict");

        ArrayList<MeetingInterval> meet3 = new ArrayList<MeetingInterval>();
        for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet3.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet3) ? "There is no conflict with attending "+meet3+" meetings":"Can't attend "+meet3+" meetings due to conflict");

        ArrayList<MeetingInterval> meet4 = new ArrayList<MeetingInterval>();
		meet4.add(new MeetingInterval(100, 150));
        meet4.add(new MeetingInterval(50, 75));
        meet4.add(new MeetingInterval(175, 300));
        meet4.add(new MeetingInterval(400, 550));
        meet4.add(new MeetingInterval(600, 675));

		System.out.println(canAttend(meet4) ? "There is no conflict with attending "+meet4+" meetings":"Can't attend "+meet4+" meetings due to conflict");
	}

}
