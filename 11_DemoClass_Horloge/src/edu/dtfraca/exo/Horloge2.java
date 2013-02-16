package edu.dtfraca.exo;

/**
 * Ameliorer classe Horloge1 par
 * - Constructor + Contructor overload (surcharge)
 * - usage de du mot cle "this"
 * - la classe peut appeler elle-meme ses propres constructors ou methodes
 * - properties accessor (get/set)
 * 
 * 2013-02-05 - Tri
 */

public class Horloge2 {
	private int _hour;   // CONSEIL: membre interne: prefix par _, exemple: _nomVariable
	private int _minute;
	private int _second;
	
	//--------------------------------------------------------------------------------
	// Constructors
	//--------------------------------------------------------------------------------
	public Horloge2() {
		//renvoi l'appel a un autre constructeur
		//Valeur par default: Heure:0, Minute:0, Second: 0
		this(0, 0, 0); 		
	}
	
	public Horloge2(int h) {
		//renvoi l'appel a un autre constructeur
		// Heure connue, valeur par default: Minute:0, Second: 0
		this(h, 0, 0); 
	}

	public Horloge2(int h, int m ) {
		// Heure, Minute connue, valeur par default: Second: 0
		this.setTime(h, m, 0); //renvoi l'appel a un autre constructeur
	}
	
	public Horloge2(int h, int m, int s ) {
		this.setTime(h, m, s);
	}

	
	public Horloge2(Horloge2 horlo) {
		this(horlo.getHour(), horlo.getMinute(), horlo.getSecond());
	}
	
	
	//--------------------------------------------------------------------------------
	// Methods (PUBLIC)
	//--------------------------------------------------------------------------------

	// Regler horloge. Lancer une erreur runtime en cas de valeur illogique
	public void setTime( int h, int m, int s )
	{
		// Verifie validite des valeurs H,M,S. Provoquer une erreur si incompatible
		// Heure : 0 - 23
		// Minute: 0 - 59
		// Second: 0 - 59
		if ( ( h >= 0 && h < 24 ) && ( m >= 0 && m < 60 ) && ( s >= 0 && s < 60 ) ) 
		{
			this.setHour(h);
			this.setMinute(m);
			this.setSecond(s);
		}
		else {
			throw new IllegalArgumentException( "Heure/Minute/Second: valeur illegale" );
		}
	}

	// Heure en format 24 Heures (HH:MM:SS)
	public String toString24H()
	{
		return String.format( "%02d:%02d:%02d", this._hour, this._minute, this._second);
	}
	
	// Heure en format US (H:MM:SS AM or PM)
	public String toStringUS()
	{
		return String.format( "%2d:%2d:%2d %s", 
				( ( _hour == 0 || _hour == 12 ) ? 12 : _hour % 12 ),
				_minute, _second, ( _hour < 12 ? "AM" : "PM" ) );
	}
	
	
	//--------------------------------------------------------------------------------
	// Public Accessor (get/set)
	// Code genere par:
	// 1. highlight the private member name
	// 2. right-click: Refactor / Encapsulate Fields
	// 3. Select: public, adjust method Names and click OK
	//--------------------------------------------------------------------------------
	
	public int getHour() {
		return _hour;
	}

	public void setHour(int h) {
		if ( h >= 0 && h < 24 )
			this._hour = h;
		else
			throw new IllegalArgumentException( "Heure doit etre 0-23" );
	}

	public int getMinute() {
		return _minute;
	}

	public void setMinute(int m) {
		if ( m >= 0 && m < 60 )
			this._minute = m;
		else
			throw new IllegalArgumentException( "Minute doit etre 0-59" );
	}

	public int getSecond() {
		return _second;
	}

	public void setSecond(int s) {
		if ( s >= 0 && s < 60 )
			this._second = s;
		else
			throw new IllegalArgumentException( "Seconde doit etre 0-59" );
	}
	
}
