/*
 * Copyright (c) 2021, Nathan DJIAN-MARTIN (DevKrazy).
 * This ConnectionListeners.java file is a part of the Smedalis project.
 * Smedalis cannot be copied and/or distributed without the express permission of Nathan DJIAN-MARTIN (DevKrazy)
 *
 */

package com.devkrazy.citiesoffreedom.listeners;

import com.devkrazy.citiesoffreedom.player.CoFPlayersManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectionListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        CoFPlayersManager manager = CoFPlayersManager.getInstance();
        manager.createCoFPlayer(player);
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        CoFPlayersManager manager = CoFPlayersManager.getInstance();
        manager.deleteCoFPlayer(player);
    }
}
