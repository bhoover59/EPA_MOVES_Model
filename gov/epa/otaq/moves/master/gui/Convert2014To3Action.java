/**************************************************************************************************
 * @(#)Convert2014To3Action.java
 *
 *
 *
 *************************************************************************************************/
package gov.epa.otaq.moves.master.gui;

import javax.swing.Action;

/**
 * Class for MOVES "Convert MOVES2014 Input Database to MOVES3" menu option.
 *
 * @author		Daniel Bizer-Cox
 * @version		2020-04-02
**/
public class Convert2014To3Action extends JLFAbstractAction {
	/** Constant command key text. **/
	static final String ACTION_COMMAND_KEY =
			"convert2014To3";
	/** Constant action name. **/
	static final String NAME =
			"Convert MOVES2014 Input Database to MOVES3";
	/** Constant short description text. **/
	static final String SHORT_DESCRIPTION =
			"Start the Database Converter GUI";
	/** Constant long description text. **/
	static final String LONG_DESCRIPTION =
			"Convert MOVES2014 input databases to MOVES3 format";
	/** Constant mnemonic key. **/
	static final int MNEMONIC_KEY = 'v';

	/**
	 * Implements the menu option UI, including command keys,
	 * name, descriptions, and icons.
	**/
	public Convert2014To3Action() {
		putValue(Action.NAME, NAME);
		putValue(Action.SHORT_DESCRIPTION, SHORT_DESCRIPTION);
		putValue(Action.LONG_DESCRIPTION, LONG_DESCRIPTION);
		putValue(Action.MNEMONIC_KEY, Integer.valueOf(MNEMONIC_KEY));
		putValue(Action.ACTION_COMMAND_KEY, ACTION_COMMAND_KEY);
	}
}
