Users involved are:
		a) Parties involved in the dispute.
			1. Accuser/victim - reports the incident
			2. Accused/Perp - caused the incident.
		b) Party listening to case. Makes decision on the dispute. Chief/local administration official



## Application Flow
  1. User(Ua) are presented with login or create account options. On launching app, user presented with screen to sign up 
  or register. 
  		a) On selecting Register option, user is presented with a SIGNUP screen with fields to fill in to register. Fields are:
  		Names, email/phone number field(either one), New Pin, repeat Pin, Location, and a Register button. All fields are 
      compulsory. On filling all and hitting the Register button, they are presented the sign in screen (S1b)
  		
  		b) LOGIN screen. User sees this when they hit Login Button. Here they're presented 3 fields to enter login details.
      Fields are: email/phone number
  		field, and password field. On filling these, they then hit the LOGIN button to go to the HOME screen. There also is a 
      button here that resets their password incase they forgot it.

  		c) HOME screen. This is the landing page when a user logs in successfully. This has two options.
  		  1. A news feed/announcement board. This is populated with information from the chief or local administration. Users
        will see this and can interact with it. Clicking on one will open it with more details (maybe expanded as a dialog) 
        This can also contain upcoming Baraza meeting schedules
  		  2. An option to raise a complain or report a dispute where user is the affected one.

  		d) REPORT Screen. User gets here from the Home screen, if they want to report a dispute. They are presented a screen
      with the following fields:
  		  1. Name.
  		  2. Nature of dispute. This can be a drop-down menu
  		  3. Details field - Here they state what happened, or provide details on the nature of the dispute.
  		  4. Name of involved party/accused.
  		  5. Phone Number of accused.
  		  6. Submit button.
  		  On filling the fields and hitting submit, user is presented with a success dialog on successful submission. On 
        hitting back they go back to the home screen. This time, however, there's an additional field for the issue they 
        reported. 
        This is greyed out. When the chief addresses issue, it turns to green.


  	2. User (Ub) is presented with CHIEF LOGIN screen. (Maybe we'll need to register the chiefs ourselves, to do away with 
    chances
    of fraud, or to ensrure only valid chiefs act as). CHIEF LOGIN screen has the following fields: chief id, password. On 
    hitting the login button, they see the chief dashboard.

  	3. DASHBOARD Screen has two options: Field that has disputes as reported, Field where chief posts announcements.

  	4. ANNOUNCEMENTS Screen - Chief is presented fields as follows: Title, Details. (Ideally he should be able to 
    update/delete these)

  	5. CONFLICTS/DISPUTES Screen - After users have reported disputes, chief sees them from this screen. He can select one,
    from which he can perform the following actions: Summon the parties, Pass decision.

  	6.SUMMON Screen - Chief sees this when he clicks summon. Here he sees two fields, date selector, location as a text 
    field, and whether to summon both parties, or either one of them. Once he hits summon, selected users receive notification
    (maybe sms) with relevant details of summoning.
    
   ## Application Databases
    The database for baraza contains tables and columns as follows:

(t1)users - stores information on registered users
A date registered
RU first name
RU last name
RU phone # (primary key)

(t2)chiefs - stores information on registered chiefs
A date registered
AD first Name
AD last Name
AD chief # (primary key)
AD phone #

(t3)conflicts - stores information on reported conflicts
A conflict # (primary key)
RU nature of Conflict
RU details
RU name of victim/reporter
RU name of accused
RU number of accused
C resolution passed
C resolution passed

(t4) events/announcement - stores events and announcements posted by chief
C name of event/anouncement
C details
A date made
C event date
A event #

The letters to the left indicate who populates what field.
C for chief, RU for registered user, A for auto-filled, AD for administrator.

User registers from phone application. Info is saved in t1. On logging in, they see an option of reporting an issue. When they report an issue, this info is saved in t3. The other option is seeing a feed that is populated from t4.

Chiefs are registered from the server into t3 not from the application this is for au.

When chief signs in, they see conflicts and option for events and announcements. Conflicts are populated from t3. They are responsible for editing some columns. They populate events t4.
