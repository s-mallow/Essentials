package net.essentialsx.discord.interactions;

import net.dv8tion.jda.api.entities.Role;
import net.essentialsx.api.v2.services.discord.InteractionRole;

public class InteractionRoleImpl implements InteractionRole {
    private final Role role;

    public InteractionRoleImpl(Role role) {
        this.role = role;
    }

    @Override
    public String getName() {
        return role.getName();
    }

    @Override
    public boolean isManaged() {
        return role.isManaged();
    }

    @Override
    public boolean isPublicRole() {
        return role.isPublicRole();
    }

    @Override
    public int getColorRaw() {
        return role.getColorRaw();
    }

    @Override
    public boolean isDefaultColor() {
        return role.getColorRaw() == Role.DEFAULT_COLOR_RAW;
    }

    public Role getJdaObject() {
        return role;
    }

    @Override
    public String getId() {
        return role.getId();
    }
}
