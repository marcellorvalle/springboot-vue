import Axios, { AxiosResponse } from 'axios';

class RemoteCall {
  public doCall(): Promise<AxiosResponse> {
    return Axios.get('http://localhost:8080/hello');
  }
}

export default new RemoteCall();
