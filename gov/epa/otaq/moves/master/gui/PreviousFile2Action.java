/**************************************************************************************************
 * @(#)PreviousFile2Action.java 
 *
 *
 *
 *************************************************************************************************/
package gov.epa.otaq.moves.master.gui;

import javax.swing.Action;

/**
 * Class for MOVES PreviousFile2 menu option.
 *
 * @author		Cimulus
 * @version		2003-09-11
**/
public class PreviousFile2Action extends JLFAbstractAction {
	/** Constant command key text. **/
	static final String ACTION_COMMAND_KEY_PREVIOUS_FILE2 = "previous-file2-command";
	/** Constant action name. **/
	static final String NAME_PREVIOUS_FILE2 = "2 ";
// CIM: NOT DONE
//	static final String SMALL_ICON_PREVIOUS_FILE2 = 
//			"toolbarButtonGraphics/general/PreviousFile216.gif";
//	static final String LARGE_ICON_PREVIOUS_FILE1 = 
//			"toolbarButtonGraphics/general/PreviousFile224.gif";
	/** Constant short description text. **/
	static final String SHORT_DESCRIPTION_PREVIOUS_FILE2 = "2 ";
	/** Constant long description text. **/
	static final String LONG_DESCRIPTION_PREVIOUS_FILE2 = "Load File: ";
	/** Constant mnemonic key. **/
	static final int MNEMONIC_KEY_PREVIOUS_FILE2 = '2';

	/**
	 * Implements the PreviousFile2 menu option UI, including command keys, name, 
	 * descriptions, and icons.
	**/
	public PreviousFile2Action() {
		putValue(Action.NAME, NAME_PREVIOUS_FILE2);
//		putValue(Action.SMALL_ICON, getIcon(SMALL_ICON_PREVIOUS_FILE2));
//		putValue(LARGE_ICON, getIcon(LARGE_ICON_PREVIOUS_FILE2));
		putValue(Action.SHORT_DESCRIPTION, SHORT_DESCRIPTION_PREVIOUS_FILE2);
		putValue(Action.LONG_DESCRIPTION, LONG_DESCRIPTION_PREVIOUS_FILE2);
		putValue(Action.MNEMONIC_KEY, Integer.valueOf(MNEMONIC_KEY_PREVIOUS_FILE2));
		putValue(Action.ACTION_COMMAND_KEY, ACTION_COMMAND_KEY_PREVIOUS_FILE2);
	}

	/**
	 * Sets the short description text of this action, after the default prefix.
	 * @param	newText	the new short description as text to add after the default prefix.
	**/
	public void setShortDescription(String newText) {
		putValue(Action.SHORT_DESCRIPTION, SHORT_DESCRIPTION_PREVIOUS_FILE2 + newText);
	}
}
