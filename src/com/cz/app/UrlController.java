package com.cz.app;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by tianyaoluke on 7/5/17.
 */
public class UrlController implements FocusListener, DocumentListener, PropertyChangeListener {
        private final JTextField textComp;
        private boolean isEmpty;
        private Color ghostColor;
        private Color foregroundColor;
        private final String ghostText;

    public UrlController(final JTextField textComp, String ghostText)
        {
            super();
            this.textComp = textComp;
            this.ghostText = ghostText;
            this.ghostColor = Color.LIGHT_GRAY;
            textComp.addFocusListener(this);
            registerListeners();
            updateState();
            if (!this.textComp.hasFocus())
            {
                focusLost(null);
            }
        }

    public void delete()
    {
        unregisterListeners();
        textComp.removeFocusListener(this);
    }

    private void registerListeners()
    {
        textComp.getDocument().addDocumentListener(this);
        textComp.addPropertyChangeListener("foreground", this);
    }

    private void unregisterListeners()
    {
        textComp.getDocument().removeDocumentListener(this);
        textComp.removePropertyChangeListener("foreground", this);
    }

    public Color getGhostColor()
    {
        return ghostColor;
    }

    public void setGhostColor(Color ghostColor)
    {
        this.ghostColor = ghostColor;
    }

    private void updateState()
    {
        isEmpty = textComp.getText().length() == 0 || textComp.getText().equals(ghostText);
        foregroundColor = textComp.getForeground();
    }

    @Override
    public void focusGained(FocusEvent e)
    {
        if (isEmpty)
        {
            unregisterListeners();
            try
            {
                textComp.setText("");
                textComp.setForeground(Color.black);
            }
            finally
            {
                registerListeners();
            }
        }

    }

    @Override
    public void focusLost(FocusEvent e)
    {
        if (isEmpty)
        {
            unregisterListeners();
            try
            {
                textComp.setText(ghostText);
                textComp.setForeground(ghostColor);
            }
            finally
            {
                registerListeners();
            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        updateState();
    }

    @Override
    public void changedUpdate(DocumentEvent e)
    {
        updateState();
    }

    @Override
    public void insertUpdate(DocumentEvent e)
    {
        updateState();
    }

    @Override
    public void removeUpdate(DocumentEvent e)
    {
        updateState();
    }

}

