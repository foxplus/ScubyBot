/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.tondorf.scubybot;

import java.net.Socket;
import java.io.IOException;
import de.tdng2011.game.library.connection.AbstractClient;
import de.tdng2011.game.library.connection.RelationTypes;
import de.tdng2011.game.library.World;
/**
 *
 * @author FoXPlus
 */
public class ScubyConnector extends AbstractClient{

  private String PlayerName = "DefaultName";

  public String name(){
      return "DEFAULT";
  }
  public ScubyConnector(final String hostname, final String PlayerName){
      super(hostname, RelationTypes.Player());
      //this.PlayerName = PlayerName;
  }

  public void processWorld(World world){

  }

}
