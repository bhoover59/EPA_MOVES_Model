/**************************************************************************************************
 * @(#)PreviousFile3Action.java 
 *
 *
 *
 *************************************************************************************************/
package gov.epa.otaq.moves.master.gui;

import javax.swing.Action;

/**
 * Class for MOVES PreviousFile3 menu option.
 *
 * @author		Cimulus
 * @version		2003-09-11
**/
public class PreviousFile3Action extends JLFAbstractAction {
	/** Constant command key text. **/
	static final String ACTION_COMMAND_KEY_PREVIOUS_FILE3 = "previous-file3-command";
	/** Constant action name. **/
	static final String NAME_PREVIOUS_FILE3 = "3 ";
// CIM: NOT DONE
//	static final String SMALL_ICON_PREVIOUS_FILE3 = 
//			"toolbarButtonGraphics/general/PreviousFile316.gif";
//	static final String LARGE_ICON_PREVIOUS_FILE3 = 
//			"toolbarButtonGraphics/general/PreviousFile324.gif";
	/** Constant short description text. **/
	static final String SHORT_DESCRIPTION_PREVIOUS_FILE3 = "3 ";
	/** Constant long description text. **/
	static final String LONG_DESCRIPTION_PREVIOUS_FILE3 = "Load File: ";
	/** Constant mnemonic key. **/
	static final int MNEMONIC_KEY_PREVIOUS_FILE3 = '3';

	/**
	 * Implements the PreviousFile3 menu option UI, including command keys, name, 
	 * descriptions, and icons.
	**/
	public PreviousFile3Action() {
		putValue(Action.NAME, NAME_PREVIOUS_FILE3);
//		putValue(Action.SMALL_ICON, getIcon(SMALL_ICON_PREVIOUS_FILE3));
//		putValue(LARGE_ICON, getIcon(LARGE_ICON_PREVIOUS_FILE3));
		putValue(Action.SHORT_DESCRIPTION, SHORT_DESCRIPTION_PREVIOUS_FILE3);
		putValue(Action.LONG_DESCRIPTION, LONG_DESCRIPTION_PREVIOUS_FILE3);
		putValue(Action.MNEMONIC_KEY, Integer.valueOf(MNEMONIC_KEY_PREVIOUS_FILE3));
		putValue(Action.ACTION_COMMAND_KEY, ACTION_COMMAND_KEY_PREVIOUS_FILE3);
	}

	/**
	 * Sets the short description text of this action, after the default prefix.
	 * @param	newText	the new short description as text to add after the default prefix.
	**/
	public void setShortDescription(String newText) {
		putValue(Action.SHORT_DESCRIPTION, SHORT_DESCRIPTION_PREVIOUS_FILE3 + newText);
	}
}
