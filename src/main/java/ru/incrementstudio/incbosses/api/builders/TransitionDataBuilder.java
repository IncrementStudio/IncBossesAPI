package ru.incrementstudio.incbosses.api.builders;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.MemoryConfiguration;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.phases.Phase;
import ru.incrementstudio.incbosses.api.bosses.phases.TransitionCondition;
import ru.incrementstudio.incbosses.api.bosses.phases.TransitionData;

public final class TransitionDataBuilder {
    private final TransitionCondition condition;
    private final ConfigurationSection section = new MemoryConfiguration();

    public TransitionDataBuilder(String type) {
        if (type.isEmpty())
            throw new IllegalArgumentException("Transition condition name is empty!");
        if (!TransitionData.getConditions().containsKey(type.toLowerCase()))
            throw new IllegalArgumentException("Transition condition with type '" + type.toLowerCase() + "' not found!");
        condition = TransitionData.getConditions().get(type.toLowerCase());
    }

    public TransitionDataBuilder(TransitionCondition condition) {
        this.condition = condition;
    }

    public TransitionDataBuilder addParameter(String path, Object value) {
        section.set(path, value);
        return this;
    }
    public TransitionDataBuilder removeParameter(String path) {
        section.set(path, null);
        return this;
    }

    public TransitionData build() {
        return new TransitionData() {
            @Override
            public boolean checkTransition(@NotNull Phase phase) {
                return condition.check(section, phase);
            }
        };
    }
}
