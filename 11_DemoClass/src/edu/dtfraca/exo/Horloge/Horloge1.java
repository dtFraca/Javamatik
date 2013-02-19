package edu.dtfraca.exo.Horloge;

/**
 * Demo inspire du livre “Java for Programmers, 2nd Edition par Paul & Harvey Deitel” Chapitre 8 “Class and Object: A Deeper Look”
 * Tres simple class avec seulement des methods public
 * 
 * 2013-02-05 - Tri
 */
public class Horloge1 {

	private int _hour;   // CONSEIL: membre interne: prefix par _, exemple: _nomVariable
	private int _minute;
	private int _second; 

	// Regler horloge. Lancer une erreur runtime en cas de valeur illogique
	public void setTime( int h, int m, int s )
	{
		// Verifie validite des valeurs H,M,S. Provoquer une erreur si incompatible
		// Heure : 0 - 23
		// Minute: 0 - 59
		// Second: 0 - 59
		if ( ( h >= 0 && h < 24 ) && ( m >= 0 && m < 60 ) && ( s >= 0 && s < 60 ) ) 
		{
			this._hour   = h;
			this._minute = m;
			this._second = s;
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
	

}