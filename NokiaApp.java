import java.util.Scanner;
 public class NokiaApp {
   public static void main(String[] args) {

Scanner receive = new Scanner(System.in);

System.out.println("""


	1.phonebook

	2.message

	3.chat 

	4.call register

	5.tones

	6.setting

	7.call divert

	8.Games

	9.calculator

	10.Remainders

	11.clock

	12.profiles

	13.sim services

""");

int read = receive.nextInt();
switch(read){
case 1:System.out.println("""

	1.search

	2.service Nos.

	3.Add name

	4.erase

	5.edit

	6.assign tone

	7.send b'card

	8.options

	9.speed dials

	10.voice tags
""");

System.out.println("Enter any ");
int options = receive.nextInt();
	switch(options){
case 8:System.out.println("""


	1.Type of view

	2.Memory status
""");
	break;

	}

System.out.println("Enter any ");
int message = receive.nextInt();
	switch(message){
case 2:System.out.println("""

	1.write messages

	2.inbox

	3.outbox

	4.picture messages

	5.Templates

	6.Smileys

	7.Message settings

	8.Info service

	9.Voice mailbox number

	10.Service command editor
""");
	break;
	}

System.out.println("Enter any ");
int MessageSettings = receive.nextInt();
	switch(MessageSettings){
case 7:System.out.println("""

	1.Set1

	2.Common
""");
	break;

	}

System.out.println("Enter any ");
int Set1 = receive.nextInt();
	switch(Set1){
case 1:System.out.println("""

	1.Message centre number

	2.Message sent as 

	3.Message validity
""");
	break;

	}

System.out.println("Enter any ");
int Common = receive.nextInt();
	switch(Common){
case 2:System.out.println("""

	1.Delivery reports

	2.Reply via same centre

	3.Character support
""");
	break;

	}

System.out.println("Enter any ");
int chat = receive.nextInt();
	switch(chat){
case 8:System.out.println("""

	1.Notepad

	2.Check book
""");
	break;

	}

System.out.println("Enter any ");
int callRegister = receive.nextInt();
	switch(callRegister){
case 4:System.out.println("""

	1.Missed calls

	2.Received calls

	3.Dialled numbers

	4.Erase recent call lists

	5.Show call duration
	
	6.Show call costs

	7.Call cost settings

	8.Prepaid credit
""");
	break;

	}

System.out.println("Enter any ");
int tones = receive.nextInt();
	switch(tones){
case 5:System.out.println("""

	1.Ringing tone

	2.Ringing volume

	3.Incoming call alert

	4.Composer

	5.Message alert tone

	6.Keypad tones

	7.Waming and game tones

	8.Vibrating alert

	9.Screen saver
""");
	break;

	}
System.out.println("Enter any :");
int settings = receive.nextInt();
	switch(settings){
case 6:System.out.println("""

	1.Call settings

	2.Phone settings

	3.Security settings

	4.Restore factory settings
""");
	break;

	}

System.out.println("Enter any: ");
int CallSettings = receive.nextInt();
	switch(CallSettings){
case 1:System.out.println("""

	1.Automatic redial

	2.Speed dialling

	3.Call waiting options

	4.Own number sending

	5.Phone line in use

	6.Automatic answer
""");
	break;

	}

System.out.println("Enter any ");
int PhoneSettings = receive.nextInt();
	switch(PhoneSettings){
case 2:System.out.println("""

	1.Language

	2.Cell info display

	3.Welcome note

	4.Network selection

	5.Lights

	6.Confirm Sim service actions
""");
	break;

	}

System.out.println("Enter any ");
int SecuritySettings = receive.nextInt();
	switch(SecuritySettings){
case 3:System.out.println("""

	1. Pin code request

	2.call barring service

	3.Fixed dialling
	
	4.Closed user group

	5.Phone security

	6.Change access codes
""");
	break;

	}

System.out.println("Enter any ");
int callDivert = receive.nextInt();
	switch(callDivert){
case 7:System.out.println("""

	
	1. call muted
""");
	break;

	}

System.out.println("Enter any ");
int Games = receive.nextInt();
	switch(Games){
case 8:System.out.println("""

	1. java

	2.snooker
""");
	break;
	
	}

System.out.println("Enter any ");
int calculator = receive.nextInt();
	switch(calculator){
case 9:System.out.println("""

	1.Grade A calculator
	
	2.Grade B calculator
""");
	break;

	}

System.out.println("Enter any ");
int Remainders = receive.nextInt();
	switch(Remainders){
case 10:System.out.println("""

	1. Democracy day
""");
	break;

	}

System.out.println("Enter any ");
int clock = receive.nextInt();
	switch(clock){
case 11:System.out.println("""

	1.Alarm clock
	
	2.Clock settings

	3.Date setting

	4.Stopwatch

	5.Countdown timer

	6.Auto update of date and time
""");
	break;

	}

System.out.println("Enter any ");
int profiles = receive.nextInt();
	switch(profiles){
case 12:System.out.println("""

	1. Dynamics

	2. Live wallpaper
""");
	break;

	}

System.out.println("Enter any ");
int SimServices = receive.nextInt();
	switch(SimServices){
case 13:System.out.println("""

	1. Glo

	2. Mtn

	3. Airtel
""");
	break;

	}

}


}
}