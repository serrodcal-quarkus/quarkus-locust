package com.serrodcal.poc;

import io.quarkus.vertx.web.Route;
import io.smallrye.mutiny.Uni;
import io.vertx.core.http.HttpMethod;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.jboss.logging.Logger;

import javax.inject.Singleton;

@Singleton
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    @Route(path = "/hello", methods = HttpMethod.GET)
    @Counted(name = "performedChecks", description = "How many primality checks have been performed.")
    @Timed(name = "checksTimer", description = "A measure of how long it takes to perform the primality test.", unit = MetricUnits.MILLISECONDS)
    public Uni<String> hello() {
        this.LOG.info("hello!");
        return Uni.createFrom().item("Hello!");
    }
    
}