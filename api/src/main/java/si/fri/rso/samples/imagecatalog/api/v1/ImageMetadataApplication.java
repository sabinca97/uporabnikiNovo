package si.fri.rso.samples.imagecatalog.api.v1;

import com.kumuluz.ee.metrics.producers.MetricRegistryProducer;
import org.eclipse.microprofile.metrics.Counter;
import org.eclipse.microprofile.metrics.MetricRegistry;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/v1")
public class ImageMetadataApplication extends Application {

}
