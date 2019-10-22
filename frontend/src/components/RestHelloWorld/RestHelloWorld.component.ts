import Vue from 'vue';
import Component from 'vue-class-component';
import RemoteCall from '../../services/RemoteCall.service';

@Component({})
export default class RestHelloWorldComponent extends Vue {
  private counter: number = 0;
  private message: string = 'not called yet';

  public doCall() {
    RemoteCall.doCall().then(response => (this.message = response.data));
  }

  // private mounted() {}
}
