import Axios, {AxiosResponse} from 'axios';

class RemoteCall {
    public doCall(): Promise<AxiosResponse> {
        const root = process.env.VUE_APP_ROOT_API ? process.env.VUE_APP_ROOT_API : window.location.origin;
        return Axios.get(root + '/hello');
    }
}

export default new RemoteCall();
