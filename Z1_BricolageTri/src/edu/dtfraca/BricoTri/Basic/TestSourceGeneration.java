package edu.dtfraca.BricoTri.Basic;

import java.util.Date;

/**
 * Test Eclipse Source Code Generation, Refactoring
 * http://www.vogella.com/articles/Eclipse/article.html#codegenerator
 * http://www.vogella.com/articles/Eclipse/article.html#exercise_refactoring
 */
public class TestSourceGeneration {
	private String _countryName;
	private int _population;
	private Date _nationalDay;
	
	public TestSourceGeneration(String _countryName, int _population) {
		super();
		this._countryName = _countryName;
		this._population = _population;
		
		//This line was a block of code, which has become an elegant line
		//thanks to Refactor - Extract Method
		int cumulTotal = this.calculateCumulTotal();
	}

	/**
	 * This method were created by Refactoring 
	 * (Select a chunk of code somewhere, Select Refactoring / Extract Method)
	 * Then Eclipse creates the method and replaces the original code by a call to the method
	 * All we need to do is to re-arrange a little bit the code (adding param, return, etc.)
	 */
	private int calculateCumulTotal() {
		int cumulTotal = 0;
		for (int kk = 0; kk < 100; kk++) {
			cumulTotal += kk;
		}
		return cumulTotal;
	}

	public String get_countryName() {
		return _countryName;
	}

	public void set_countryName(String _countryName) {
		this._countryName = _countryName;
	}

	public int get_population() {
		return _population;
	}

	public void set_population(int _population) {
		this._population = _population;
	}

	public Date get_nationalDay() {
		return _nationalDay;
	}

	public void set_nationalDay(Date _nationalDay) {
		this._nationalDay = _nationalDay;
	}

	@Override
	public String toString() {
		return "TestSourceGeneration [CountryName=" + _countryName
				+ ", Population =" + _population + ", NationalDay="
				+ _nationalDay + "]";
	}

}
